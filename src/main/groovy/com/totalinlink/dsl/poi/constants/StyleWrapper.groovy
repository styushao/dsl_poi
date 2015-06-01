package com.totalinlink.dsl.poi.constants

import org.apache.poi.ss.usermodel.CellStyle

/**
 * Created by wangguangyu on 15/6/2.
 */
class StyleWrapper {

    // alignment
    def static center      = CellStyle.ALIGN_CENTER
    def static left        = CellStyle.ALIGN_LEFT
    def static right       = CellStyle.ALIGN_RIGHT
    def static justify     = CellStyle.ALIGN_JUSTIFY
    def static fill        = CellStyle.ALIGN_FILL
    def static general     = CellStyle.ALIGN_GENERAL
    def static center_sel  = CellStyle.ALIGN_CENTER_SELECTION

    // vertical alignment
    def static vertical_top     = CellStyle.VERTICAL_TOP
    def static vertical_bottom  = CellStyle.VERTICAL_BOTTOM
    def static vertical_center  = CellStyle.VERTICAL_CENTER
    def static vertical_justify = CellStyle.VERTICAL_JUSTIFY

    // border
    def static border_dash_dot            = CellStyle.BORDER_DASH_DOT
    def static border_dash_dot_dot        = CellStyle.BORDER_DASH_DOT_DOT
    def static border_dashed              = CellStyle.BORDER_DASHED
    def static border_dotted              = CellStyle.BORDER_DOTTED
    def static border_double              = CellStyle.BORDER_DOUBLE
    def static border_hair                = CellStyle.BORDER_HAIR
    def static border_medium              = CellStyle.BORDER_MEDIUM
    def static border_medium_dash_dot     = CellStyle.BORDER_MEDIUM_DASH_DOT
    def static border_medium_dash_dot_dot = CellStyle.BORDER_MEDIUM_DASH_DOT_DOT
    def static border_medium_dashed       = CellStyle.BORDER_MEDIUM_DASHED
    def static border_none                = CellStyle.BORDER_NONE
    def static border_slanted_dash_dot    = CellStyle.BORDER_SLANTED_DASH_DOT
    def static border_thick               = CellStyle.BORDER_THICK
    def static border_thin                = CellStyle.BORDER_THIN

}
