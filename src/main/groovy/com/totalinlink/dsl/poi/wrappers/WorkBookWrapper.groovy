package com.totalinlink.dsl.poi.wrappers
import com.totalinlink.dsl.poi.WorkBookBuilder
import org.apache.poi.xssf.usermodel.XSSFWorkbook
/**
 * Created by wangguangyu on 15/5/24.
 */
class WorkBookWrapper extends NodeWrapper {

    // sheets in wrapper
    def sheets = []
    // file name
    def filename

    @Override
    void syncNode() {
        if (!this.poiObject) {
            this.poiObject = new XSSFWorkbook()
        }
        sheets.each {
            it.syncNode()
        }
    }

    @Override
    void setNode(child) {
        assert child instanceof SheetWrapper
        sheets << child
    }

    def WorkBookWrapper(WorkBookBuilder workBookBuilder, Map attributes) {

        super(workBookBuilder, attributes)

        this.filename = attributes.filename
//
//        def file = new File(filename)
//        if (file.exists()) {
//            // file.createNewFile()
//            file.delete()
//        }
//        poiWorkbook = new XSSFWorkbook()
    }

    def save() {
        assert filename
        def file = new File(filename)

        if (file.exists()) {
            file.delete()
        }

        def outputStream  = new FileOutputStream(filename)
        save(outputStream)

    }

    def save(os) {
        assert os
        try {
            syncNode()
            this.poiObject = this.poiObject ?: new XSSFWorkbook()
            this.poiObject.write(os)
        } catch (IOException e) {
            e.printStackTrace()
        } finally {
            os.close()
        }
    }
}
