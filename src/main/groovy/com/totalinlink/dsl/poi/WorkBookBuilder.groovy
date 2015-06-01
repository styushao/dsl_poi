package com.totalinlink.dsl.poi

import com.totalinlink.dsl.poi.factory.WrapperManager
import com.totalinlink.dsl.poi.wrappers.NodeWrapper

/**
 * Created by wangguangyu on 15/5/24.
 */
class WorkBookBuilder extends BuilderSupport {

    // workbook
    def workbook

    // a pointer for current poiObject
    def curSheet

    @Override
    protected void setParent(Object parent, Object child) {
        // println "${parent}, ${child}"
        ((NodeWrapper) parent).setNode(child)
    }

    @Override
    protected Object createNode(Object name) {
        return createNode(name, null, null)
    }

    @Override
    protected Object createNode(Object name, Object value) {
        return createNode(name, null, value)
    }

    @Override
    protected Object createNode(Object name, Map attributes) {
        return createNode(name, attributes, null)
    }

    @Override
    protected Object createNode(Object name, Map attributes, Object value) {
        // println "${name}, ${attributes}, ${value}"
        return WrapperManager.getFactory(name).createNode(this, value, attributes)
    }

    def save() {
        workbook.save()
    }
}
