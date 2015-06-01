package com.totalinlink.dsl.poi.factory

import java.security.InvalidParameterException

/**
 * Created by wangguangyu on 15/5/28.
 */
class WrapperManager {

    /**
     * keys for factories
     */
    static String WORK_BOOK_KEY         = "CALL"
    static String SHEET_KEY             = "SHEET"
    static String MERGED_REGION_KEY     = "MERGEDREGION"
    static String ROW_KEY               = "ROW"
    static String ROWS_KEY              = "ROWS"
    static String CELL_KEY              = "CELL"

    /**
     * container for factories
     */
    private static map = [:]

    static {
        // initialize factory container
        map[WORK_BOOK_KEY]         = new WorkBookWrapperFactory()
        map[SHEET_KEY]             = new SheetWrapperFactory()
        map[MERGED_REGION_KEY]     = new MergedRegionWrapperFactory()
        map[ROW_KEY]               = new RowWrapperFactory()
        map[ROWS_KEY]              = new MultiRowWrapperFactory()
        map[CELL_KEY]              = new CellWrapperFactory()
    }

    static WrapperFactory getFactory(name) {

        def itemKey = name.toUpperCase()
        def factory = map[itemKey]

        if(!factory)
            throw new InvalidParameterException("${name} is invalid.")

        return factory
    }
}
