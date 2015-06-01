package com.totalinlink.dsl.poi.wrappers

import com.totalinlink.dsl.poi.WorkBookBuilder
import org.apache.poi.ss.util.CellRangeAddress

/**
 * Created by wangguangyu on 15/5/24.
 */
class MergedRegionWrapper extends NodeWrapper {

    // sheet wrapper
    def sheet
    def firstRow, lastRow, firstCol, lastCol

    @Override
    void syncNode() {
        this.poiObject = new CellRangeAddress(this.firstRow, this.lastRow, this.firstCol, this.lastCol)
        sheet.poiObject.addMergedRegion(this.poiObject)
    }

    MergedRegionWrapper(WorkBookBuilder workBookBuilder, Map attributes) {

        super(workBookBuilder, attributes)
        (firstRow, lastRow, firstCol, lastCol) = attributes.range
        this.workBookBuilder = workBookBuilder
        this.sheet = workBookBuilder.curSheet

    }

    @Override
    def void setNode(child) {
        return
    }
}
