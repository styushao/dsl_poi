package com.totalinlink.dsl.poi.factory

import com.totalinlink.dsl.poi.WorkBookBuilder
import com.totalinlink.dsl.poi.wrappers.MultiRowWrapper

/**
 * Created by wangguangyu on 15/5/29.
 */
class MultiRowWrapperFactory implements WrapperFactory {


    @Override
    def createNode(WorkBookBuilder workBookBuilder, Object value, Map attributes) {
        def rows = new MultiRowWrapper(workBookBuilder, attributes)
        return rows
    }
}
