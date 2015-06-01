package com.totalinlink.dsl.poi.wrappers

import com.totalinlink.dsl.poi.WorkBookBuilder

/**
 * Created by wangguangyu on 15/5/24.
 */
class CellStyleWrapper extends NodeWrapper {

    // workbook wrapper
    def workbook
    // alignment
    def align, verticalAlign
    // border
    def bottom, top, left, right
    // border color

    @Override
    void syncNode() {
        poiObject = workbook.createCellStyle()
        poiObject.alignment = align
        poiObject.verticalAlignment = verticalAlign
        poiObject.borderBottom = bottom
        poiObject.borderTop = top
        poiObject.borderLeft = left
        poiObject.borderRight = right
    }

    CellStyleWrapper(WorkBookBuilder workBookBuilder, Map attributes) {
        super(workBookBuilder, attributes)

        workbook = workBookBuilder.workbook
        (align, verticalAlign) = attributes.align
        (bottom, top, left, right) = attributes.border

    }

    @Override
    def void setNode(child) {
        return
    }
}
