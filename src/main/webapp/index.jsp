<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script src="http://how2j.cn/study/jquery.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>
</body>
<script>
    $.ajax({
        url: '/test/testSSM.action',
        data: {"name": "hello"},
        methodType: 'post',
        dataType: 'text',
        success: function (data) {
            alert(data);
        },
        error: function () {
            alert("error");
        }
    });
</script>
</html>
