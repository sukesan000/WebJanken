function checkbox(){
document.forms['form'].elements['auth1'].onclick=ckbox1;
document.forms['form'].elements['auth2'].onclick=ckbox2;
document.forms['form'].elements['auth3'].onclick=ckbox3;
}
function ckbox1(){
document.forms['form'].elements['auth2'].checked=false;
document.forms['form'].elements['auth3'].checked=false;
}
function ckbox2(){
document.forms['form'].elements['auth1'].checked=false;
document.forms['form'].elements['auth3'].checked=false;
}
function ckbox3(){
document.forms['form'].elements['auth1'].checked=false;
document.forms['form'].elements['auth2'].checked=false;
}
window.addEventListener('DOMContentLoaded',checkbox,false);