package com.totalinlink.dsl.poi.wrappers

import com.totalinlink.dsl.poi.WorkBookBuilder

/**
 * Created by wangguangyu on 15/5/24.
 */
class CellWrapper extends NodeWrapper {

    // row wrapper
    def row
    // value of cell
    def value
    // index
    def index

    @Override
    void syncNode() {
        this.poiObject = row.poiObject.createCell(index)
//        println this.poiObject.class
        this.poiObject.setCellValue(this.value)
    }

    CellWrapper(WorkBookBuilder workBookBuilder, Map attributes) {
        super(workBookBuilder, attributes)

        row = attributes.parent
        value = attributes.value
        index = attributes.index

    }

    @Override
    def void setNode(child) {
        return
    }
}
