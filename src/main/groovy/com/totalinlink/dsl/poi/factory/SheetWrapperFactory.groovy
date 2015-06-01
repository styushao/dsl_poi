package com.totalinlink.dsl.poi.factory

import com.totalinlink.dsl.poi.WorkBookBuilder
import com.totalinlink.dsl.poi.wrappers.SheetWrapper

/**
 * Created by wangguangyu on 15/5/28.
 */
class SheetWrapperFactory implements WrapperFactory {


    @Override
    def createNode(WorkBookBuilder workBookBuilder, Object value, Map attributes) {
        def sheet = new SheetWrapper(workBookBuilder, attributes)
        return sheet
    }
}
