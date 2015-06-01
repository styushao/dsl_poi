package com.totalinlink.dsl.poi.wrappers

import com.totalinlink.dsl.poi.WorkBookBuilder

/**
 * Created by wangguangyu on 15/5/24.
 */
class SheetWrapper extends NodeWrapper {

    static CLS_MAPS = [:]

    static {
        CLS_MAPS[MultiRowWrapper.class] = { sheet, lst ->
            def rs = sheet.rows
            lst.rows.each {
                it.index = rs.size()
                rs << it
            }
        }
        CLS_MAPS[RowWrapper.class] = { sheet, i ->
            def rs = sheet.rows
            rs << i
            i.index = rs.size()
        }
        CLS_MAPS[MergedRegionWrapper.class] = { sheet, r ->
            def rs = sheet.regions
            rs << r
        }
    }

    // workbook wrapper
    def workbook
    // sheet name
    def name
    // rows wrapper
    def rows = []
    // merged region
    def regions = []

    def SheetWrapper(WorkBookBuilder workBookBuilder, Map attributes) {

        super(workBookBuilder, attributes)

        this.workbook = workBookBuilder.workbook
        // check valid workbook
        assert this.workbook

        this.name = attributes?.name

        // set current sheet
        workBookBuilder.curSheet = this
    }

    @Override
    def void setNode(child) {
        CLS_MAPS[child.class](this, child)
    }

    @Override
    void syncNode() {

        assert this.workbook.poiObject
        if (name) {
            this.poiObject = this.workbook.poiObject.getSheet(name)
            if (!this.poiObject) this.poiObject = this.workbook.poiObject.createSheet(name)

        } else {
            this.poiObject = this.workbook.poiObject.createSheet()
        }
        this.workbook.poiObject.setActiveSheet(this.workbook.poiObject.getSheetIndex(this.poiObject))
        rows.each {
            it.syncNode()
        }
        regions.each {
            it.syncNode()
        }
    }
}
