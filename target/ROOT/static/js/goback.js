;
(function () {
    if (window.name == "") {
        window.name = 0;
    }
    else {
        window.name = eval(window.name) + 1;
    }
})();

function goback() {
    var c = -(eval(window.name) + 1);
    history.go(c);
}