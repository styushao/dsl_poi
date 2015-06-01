package com.totalinlink.dsl.poi.factory

import com.totalinlink.dsl.poi.WorkBookBuilder

/**
 * Created by wangguangyu on 15/5/28.
 */
interface WrapperFactory {

    def createNode(WorkBookBuilder workBookBuilder, Object value, Map attributes)
}