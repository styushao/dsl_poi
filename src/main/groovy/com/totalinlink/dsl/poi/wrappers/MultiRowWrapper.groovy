package com.totalinlink.dsl.poi.wrappers

import com.totalinlink.dsl.poi.WorkBookBuilder

/**
 * Created by wangguangyu on 15/5/24.
 */
class MultiRowWrapper extends NodeWrapper {
    @Override
    void syncNode() {
        return
    }

    // sheet wrapper
    def sheet
    def data
    def rows = []

    def MultiRowWrapper(WorkBookBuilder workBookBuilder, Map attributes) {

        super(workBookBuilder, attributes)

        this.sheet = workBookBuilder.curSheet
        this.data = attributes.data

        this.data.each {
            // println it
            // create rows with data
            def row = new RowWrapper(workBookBuilder, [cells: it])
            rows << row
        }

    }

    @Override
    def void setNode(child) {
        return
    }
}
