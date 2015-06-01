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
