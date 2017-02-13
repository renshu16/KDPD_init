/*!
 * jQuery Validation Plugin v1.15.1
 *
 * http://jqueryvalidation.org/
 *
 * Copyright (c) 2016 J鏋歳n Zaefferer
 * Released under the MIT license
 */
(function (factory) {
    if (typeof define === "function" && define.amd) {
        define(["../js/jquery", "./jquery.validate.js"], factory);
    } else if (typeof module === "object" && module.exports) {
        module.exports = factory(require("jquery"));
    } else {
        factory(jQuery);
    }
}(function ($) {

    ( function () {

        function stripHtml(value) {

            // Remove html tags and space chars
            return value.replace(/<.[^<>]*?>/g, " ").replace(/&nbsp;|&#160;/gi, " ");
        }

        // 手机号码验证
        jQuery.validator.addMethod("isMobile", function (value, element) {
            var length = value.length;
            return this.optional(element) || (length == 11 && /^1[12345789][0-9]{9}$/.test(value));
        }, "请正确填写手机号码");

        jQuery.validator.addMethod("isInteger", function (value, element) {
            return this.optional(element) || (/^[-\+]?\d+$/.test(value) && parseInt(value) >= 0);
        }, "请填写整数");
        jQuery.validator.addMethod("positiveInteger", function (value, element) {
            return this.optional(element) || (/^[-\+]?\d+$/.test(value) && parseInt(value) > 0);
        }, "请填写正整数");

        jQuery.validator.addMethod("isDecimal", function (value, element) {
            var is = true;
            if (!isNaN(value)) {
                if (value < 0)
                    is = false;

                var dot = value.indexOf(".");
                if (dot != -1) {
                    var dotCnt = value.substring(dot + 1, value.length);
                    if (dotCnt.length > 2) {
                        is = false;
                    }
                }
            } else {
                is = false;
            }

            return this.optional(element) || is;
        }, "请填写正确的金额");


    }() );


}));