function randomGuid() {
    return 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
        var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);
        return v.toString(16);
    });
}


/**
 * 根据传入id获取js对象
 * @param id 入参id
 * @returns
 */
function obj$(id) {
    return document.getElementById(id);
};
/**
 * 根据传入id获取js对象的值
 * @param id 入参id
 * @returns
 */
function val$(id) {
    var obj = document.getElementById(id);
    if (obj !== null) {
        return obj.value();
    } else {
        return null;
    }
};
/**
 * 去掉字符串前后的空格
 * @param str 入参:要去掉空格的字符串
 * @returns
 */
function trimAll(str) {
    return str.replace(/(^\s*)|(\s*$)/g, '');

};
/**
 * 去掉字符串前的空格
 * @param str 入参:要去掉空格的字符串
 * @returns
 */
function trimLeft(str) {
    return str.replace(/^\s*/g, '');

};
/**
 * 去掉字符串后的空格
 * @param str 入参:要去掉空格的字符串
 * @returns
 */
function trimRight(str) {
    return str.replace(/\s*$/, '');
}

/**
 * 判断是否是手机号
 * @param value
 * @returns {Boolean}
 */
function isPhoneNumber(str) {
    var reg = /^0?1\d{10}$/;
    return reg.test(str);
}


/**
 * 判断字符串是否为空
 * @param str 传入的字符串
 * @returns
 */
function isNotEmpty(str) {
    if (str != null && str.length > 0) {
        return true;
    }
    return false;
}

function isEmpty(str) {
    return !isNotEmpty(str);
}

function base64_decode(s) {
    return Base64.decode(s);
}

function base64_encode(s) {
    return Base64.encode(s);
}

function uuid() {
    var s = [];
    var hexDigits = "0123456789abcdef";
    for (var i = 0; i < 36; i++) {
        s[i] = hexDigits.substr(Math.floor(Math.random() * 0x10), 1);
    }
    s[14] = "4";  // bits 12-15 of the time_hi_and_version field to 0010
    s[19] = hexDigits.substr((s[19] & 0x3) | 0x8, 1);  // bits 6-7 of the clock_seq_hi_and_reserved to 01
    s[8] = s[13] = s[18] = s[23] = "-";

    var uuid = s.join("");
    return uuid;
}


// 对Date的扩展，将 Date 转化为指定格式的String
// 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，
// 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)
// 例子：
// (new Date()).Format("yyyy-MM-dd hh:mm:ss.S") ==> 2006-07-02 08:09:04.423
// (new Date()).Format("yyyy-M-d h:m:s.S")      ==> 2006-7-2 8:9:4.18
Date.prototype.Format = function (fmt) { //author: meizz
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds() //毫秒
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
};
