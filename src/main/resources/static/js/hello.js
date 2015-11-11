/**
 * Created by xie on 11.11.2015.
 */
angular.module('hello', [])
    .controller('Home', function () {
        this.greeting = {id: 'abc', content: 'Hello World!'}
    });