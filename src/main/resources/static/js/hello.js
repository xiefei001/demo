/**
 * Created by xie on 11.11.2015.
 */
angular.module('hello', [])
    .controller('Home', ['$http', function ($http) {
        var that = this;
        $http.get('/resources/').then(function (response) {
            that.greeting = response.data;
        });
        //this.greeting = {id: 'abc', content: 'Hello World!'}
    }]);