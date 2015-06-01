package com.totalinlink.dsl.poi.factory

import com.totalinlink.dsl.poi.WorkBookBuilder
import com.totalinlink.dsl.poi.wrappers.RowWrapper

/**
 * Created by wangguangyu on 15/5/28.
 */
class RowWrapperFactory implements WrapperFactory {


    @Override
    def createNode(WorkBookBuilder workBookBuilder, Object value, Map attributes) {
        def row = new RowWrapper(workBookBuilder, attributes)
        return row
    }
}
