function clearn() {
	var fileName = document.getElementById("fileId").value;
	if (fileName == ""){
		alert("选择文件上传");
		return false;
	}
	return true;
}
