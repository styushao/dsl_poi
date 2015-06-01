package com.totalinlink.dsl.poi.wrappers

import com.totalinlink.dsl.poi.WorkBookBuilder

/**
 * Created by wangguangyu on 15/5/24.
 */
class RowWrapper extends NodeWrapper {

    def wbBuilder
    // sheet wrapper
    def sheet
    // cells wrapper
    def cells = []
    // index
    def index

    def RowWrapper(WorkBookBuilder workBookBuilder, Map attributes) {

        super(workBookBuilder, attributes)

        this.sheet = workBookBuilder.curSheet
        this.wbBuilder = workBookBuilder

        def lst = attributes.cells
        this.index = attributes.index

        lst.eachWithIndex { it, counter->
            def cell = new CellWrapper(workBookBuilder, [value: it, parent: this, index: counter])
            cells << cell
        }
    }

    @Override
    def void setNode(child) {
        assert child instanceof CellWrapper
        cells << child
    }

    @Override
    void syncNode() {
        this.poiObject = sheet.poiObject.createRow(index)
        cells.each {
            it.syncNode()
        }
    }
}
