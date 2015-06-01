package com.totalinlink.dsl.poi.factory

import com.totalinlink.dsl.poi.WorkBookBuilder
import com.totalinlink.dsl.poi.wrappers.CellStyleWrapper

/**
 * Created by wangguangyu on 15/6/2.
 */
class CellStyleWrapperFactory implements WrapperFactory {
    @Override
    def createNode(WorkBookBuilder workBookBuilder, Object value, Map attributes) {
        def cellStyle = new CellStyleWrapper(workBookBuilder, attributes)
        return cellStyle
    }
}
