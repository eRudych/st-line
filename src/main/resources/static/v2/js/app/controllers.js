var app = angular.module("app", []);

//MESSAGE
app.controller("MessageController", function($scope, $http) {
    $scope.messages = [];
    $scope.messageForm = {
        id: 1,
        name: "",
        phone: "",
        message: ""
    };

    _refreshMessageData();

    $scope.submitMessage = function() {
        var method = "POST";
        var url = '/st-line';
        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.messageForm),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };

    $scope.createMessage = function() {
        _clearFormData();
    }
    $scope.deleteMessage = function(message) {
        $http({
            method: 'DELETE',
            url: '/st-line/' + message.id
        }).then(_refreshMessageData, _error);
    };

    function _refreshMessageData() {
        $http({
            method: 'GET',
            url: '/st-line'
        }).then(
            function(res) {
                $scope.messages = res.data;
            },
            function(res) {
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }

    function _success(res) {
        _clearFormData();
    }

    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }

    function _clearFormData() {
        $scope.messageForm.name = "";
        $scope.messageForm.phone = "";
        $scope.messageForm.message = ""
    };
});

//POST
app.controller("PostController", function($scope, $http) {
    $scope.posts = [];
    $scope.postForm = {
        id: 1,
        title: "",
        description: "",
        text: ""
    };

    _refreshPostData();

    $scope.submitPost = function() {
        var method = "POST";
        var url = '/st-line/posts';
        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.postForm),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };

    $scope.createPost = function() {
        _clearFormData();
    }

    $scope.deletePost = function(post) {
        $http({
            method: 'DELETE',
            url: '/st-line/posts/' + post.empId
        }).then(_refreshPostData, _error);
    };

    $scope.editPost = function(post) {
        $scope.postForm.id=post.id;
        $scope.postForm.title = post.title;
        $scope.postForm.description = post.description;
        $scope.postForm.text = post.text;
    };

    function _refreshPostData() {
        $http({
            method: 'GET',
            url: '/st-line/posts'
        }).then(
            function(res) {
                $scope.posts = res.data;
            },
            function(res) {
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }

    function _success(res) {
        _clearFormData();
    }

    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }

    function _clearFormData() {
        $scope.postForm.text = "";
        $scope.postForm.description = "";
        $scope.postForm.tittle = ""
    };
});