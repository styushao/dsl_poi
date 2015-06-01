package com.totalinlink.dsl.poi.factory

import com.totalinlink.dsl.poi.WorkBookBuilder
import com.totalinlink.dsl.poi.wrappers.MergedRegionWrapper

/**
 * Created by wangguangyu on 15/5/28.
 */
class MergedRegionWrapperFactory implements WrapperFactory {


    @Override
    def createNode(WorkBookBuilder workBookBuilder, Object value, Map attributes) {
        def mergedRegion = new MergedRegionWrapper(workBookBuilder, attributes)
        return mergedRegion
    }
}
