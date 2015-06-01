package com.totalinlink.dsl.poi

/**
 * Created by wangguangyu on 15/5/24.
 */
class TestSupport {
    static void main(args) {
        def workbook = new WorkBookBuilder()
        def lst = []
        lst << []
        lst << []
        lst << []
        lst << [1, 2, 3]
        lst << [12, 3]

        workbook (filename: "/Users/wangguangyu/temp/test.xlsx") {
//            cellStyle (
//                    // align(align: StyleWrapper.center, verticalAlign: StyleWrapper.vertical_top),
//                    //// align -> [center|left|right]
//                    //// verticalAlign -> [vertical_top|vertical_bottom|vertical_center]
//                    // border(bottom: StyleWrapper.double,
//                              top: StyleWrapper.thin,
//                              left: StyleWrapper.medium,
//                              right: StyleWrapper.dash),  //// each of values -> [double|thin|medium|dash|hair|thick]
//                    // borderColor(bottom: StyleWrapper.double,
//                              top: StyleWrapper.thin,
//                              left: StyleWrapper.medium,
//                              right: StyleWrapper.dash),  //// each of values -> color set
//                    //
//            )
            sheet (name: "aa") {
                // name: "aa"
                mergedRegion (range: [0, 1, 0, 1])
                mergedRegion (range: [10, 11, 10, 11])
                rows(data: lst)
                rows(data: lst)
            }
            sheet (name: "bb") {
                rows(data: lst)
            }
        }

        workbook.save()
    }
}
