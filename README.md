# dsl_poi
------------------------------------------------------------------------
目前功能：
创建workbook，指定文件名称
创建sheet，指定sheet名称，如果不设定，使用poi的默认生成方式
生成sheet中各个行列单元格内容，参数为一个二维数组或是list<list<String>>的方式

###示例代码：
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