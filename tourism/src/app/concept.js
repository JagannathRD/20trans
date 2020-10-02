"use strict";
exports.__esModule = true;
var rxjs_1 = require("rxjs");
function email() {
    return 'Hello world';
}
var emailValue = email();
console.log(emailValue);
var obs = new rxjs_1.Observable(function (observer) {
    observer.next('Hello Whole world');
    observer.next('Hello......');
    setTimeout(function () {
        observer.next('OK>>>>>>');
    }, 3000);
});
obs.subscribe(function (data) {
    console.log(data);
});
obs.subscribe(function (data) {
    console.log(data);
});
