userApp.controller('UserController', function($scope, $http) {
    $scope.user = {
        userName: '',
        password: ''
    }

    $scope.login = function() {
        var param = {password:$scope.user.password};
        $http.post('/user/' + $scope.user.userName + '/login', param)
            .success(function(data) {
                window.location.href = "/recoder";
            })
            .error(function(data) {
                alert(data.message);
            })
    }
})