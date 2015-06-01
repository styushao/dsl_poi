package com.totalinlink.dsl.poi.factory

import com.totalinlink.dsl.poi.WorkBookBuilder
import com.totalinlink.dsl.poi.wrappers.WorkBookWrapper

/**
 * Created by wangguangyu on 15/5/28.
 */
class WorkBookWrapperFactory implements WrapperFactory {


    @Override
    def createNode(WorkBookBuilder workBookBuilder, Object value, Map attributes) {
        def wbWrapper = new WorkBookWrapper(workBookBuilder, attributes)
        workBookBuilder.workbook = wbWrapper
        return wbWrapper
    }
}
