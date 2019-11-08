var app = angular.module("PostManagement", []);

// Controller Part
app.controller("PostController", function($scope, $http) {


    $scope.posts = [];
    $scope.postForm = {
        id: 1,
        title: "",
        description: "",
        text: ""
    };

    // Now load the data from server
    _refreshPostData();

    // HTTP POST/PUT methods for add/edit post
    // Call: http://localhost:8080/post
    // $scope.submitPost = function() {
    //
    //     var method = "";
    //     var url = "";
    //
    //     if ($scope.postForm.id == -1) {
    //         method = "POST";
    //         url = '/post';
    //     } else {
    //         method = "PUT";
    //         url = '/post';
    //     }
    //
    //     $http({
    //         method: method,
    //         url: url,
    //         data: angular.toJson($scope.postForm),
    //         headers: {
    //             'Content-Type': 'application/json'
    //         }
    //     }).then(_success, _error);
    // };

    $scope.createPost = function() {
        _clearFormData();
    }

    // HTTP DELETE- delete post by Id
    // Call: http://localhost:8080/post/{empId}
    $scope.deletePost = function(post) {
        $http({
            method: 'DELETE',
            url: '/post/' + post.empId
        }).then(_success, _error);
    };

    // In case of edit
    $scope.editPost = function(post) {
        $scope.postForm.empId = post.empId;
        $scope.postForm.empNo = post.empNo;
        $scope.postForm.empName = post.empName;
    };

    // Private Method
    // HTTP GET- get all posts collection
    // Call: http://localhost:8080/posts
    function _refreshPostData() {
        $http({
            method: 'GET',
            url: '/posts'
        }).then(
            function(res) { // success
                $scope.posts = res.data;
            },
            function(res) { // error
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }

    function _success(res) {
        _refreshPostData();
        _clearFormData();
    }

    function _error(res) {
        var data = res.data;
        var status = res.status;
        var header = res.header;
        var config = res.config;
        alert("Error: " + status + ":" + data);
    }

    // Clear the form
    function _clearFormData() {
        $scope.postForm.empId = -1;
        $scope.postForm.empNo = "";
        $scope.postForm.empName = ""
    };
});