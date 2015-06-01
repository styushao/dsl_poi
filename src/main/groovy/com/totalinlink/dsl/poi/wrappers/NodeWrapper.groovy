package com.totalinlink.dsl.poi.wrappers

import com.totalinlink.dsl.poi.WorkBookBuilder

/**
 * Created by wangguangyu on 15/5/28.
 */
abstract class NodeWrapper {

    // workbook builder object
    def workBookBuilder
    // poi object
    def poiObject

    def abstract void setNode(child)
    def abstract void syncNode()

    def NodeWrapper(WorkBookBuilder workBookBuilder, Map attributes) {
        this.workBookBuilder = workBookBuilder
    }

}