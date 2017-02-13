$().ready(function () {

    var $listForm = $("#listForm");
    var $pageTotal = $("#pageTotal");
    var $deleteButton = $("#deleteButton");
    var $refreshButton = $("#refreshButton");
    var $pageSizeSelect = $("#pageSizeSelect");
    var $pageSizeOption = $("#pageSizeOption a");
    var $moreOperation = $("#moreOperation");
    var $searchPropertySelect = $("#searchPropertySelect");
    var $searchPropertyOption = $("#searchPropertyOption a");
    var $searchValue = $("#searchValue");
    var $listTable = $("#listTable");
    var $selectAll = $("#selectAll");
    var $ids = $("#listTable input[name='ids']");
    var $contentRow = $("#listTable tr:gt(0)");
    var $sort = $("#listTable a.sort");
    var $pageSize = $("#pageSize");
    var $searchProperty = $("#searchProperty");
    var $orderProperty = $("#orderProperty");
    var $orderDirection = $("#orderDirection");
    var $pageNumber = $("#pageNumber");


    // 每页记录数选项
    $pageSizeSelect.mouseover(function () {
        var $this = $(this);
        var offset = $this.offset();
        var $menuWrap = $this.closest("div.menuWrap");
        var $popupMenu = $menuWrap.children("div.popupMenu");
        $popupMenu.css({left: offset.left, top: offset.top + $this.height() + 2}).show();
        $menuWrap.mouseleave(function () {
            $popupMenu.hide();
        });
    });

    // 每页记录数
    $pageSizeOption.click(function () {
        var $this = $(this);
        $pageSize.val($this.attr("val"));
        $pageNumber.val("1");
        $listForm.submit();
        return false;
    });

    // 更多选项
    $moreOperation.mouseover(function () {
        var $this = $(this);
        var offset = $this.offset();
        var $menuWrap = $this.closest("div.menuWrap");
        var $popupMenu = $menuWrap.children("div.popupMenu");
        $popupMenu.css({left: offset.left, top: offset.top + $this.height() + 2}).show();
        $menuWrap.mouseleave(function () {
            $popupMenu.hide();
        });
    });

    //点击表头排序
    $("th").each(function (index) {
        var th = $(this);
        var sort = th.attr("sort");
        if($orderProperty.val()&&$orderDirection.val()){
            if($orderProperty.val()==sort){
                if($orderDirection.val()=="asc"){
                    th.addClass("sortAsc");
                }else{
                    th.addClass("sortDesc");
                }
            }
        }
        if (sort) {
            th.addClass("sortth");
            th.on('click', function () {
                if ($orderProperty.val() == sort) {
                    if ($orderDirection.val() == undefined || $orderDirection.val() == "") {
                        $orderDirection.val("desc")
                    } else if ($orderDirection.val() == "desc") {
                        $orderDirection.val("asc")
                    }
                    else if ($orderDirection.val() == "asc") {
                        $orderDirection.val(undefined)
                    }
                } else {
                    $orderDirection.val("desc")
                }
                $orderProperty.val(sort);
                $listForm.submit();
            })
        }
    });


    // 页码跳转
    $.pageSkip = function (pageNumber) {
        $pageNumber.val(pageNumber);
        $listForm.submit();
        return false;
    }

});
//导出excel
function exportExcel(url){
    location.href=url+window.location.search;
}