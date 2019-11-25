var app = angular.module("app", []);

//MESSAGE
app.controller("MessageController", function($scope, $http) {
    $scope.messages = [];
    $scope.messageForm;

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
        $scope.messageForm.message = "";
    };
});

//POST
app.controller("PostController", function($scope, $http) {
    $scope.posts = [];
    $scope.postId=1;
    $scope.post;

    _refreshPostData();

    $scope.submitPost = function() {
        var method = "POST";
        var url = '/st-line/posts';
        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.post),
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
            url: '/st-line/posts/' + post.id
        }).then(_refreshPostData, _error);
    };


    $scope.editPost = function() {
        $http({
            method: 'PUT',
            url: '/st-line/posts/',
            data: angular.toJson($scope.post),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_refreshPostData, _error);
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

    $scope.getPost = function() {
        var postId = location.search.split('postId=')[1];
        $http({
            method: 'GET',
            url: '/st-line/posts/'+postId
        }).then(
            function(res) {
                $scope.post = res.data;
            },
            function(res) {
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    };

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
        $scope.post.text = "";
        $scope.post.description = "";
        $scope.post.tittle = ""
    };
});

    //PHOTO
    app.controller("PhotoController", function($scope, $http) {
        $scope.photos = [];
        $scope.products = [];
        $scope.models = [];
        $scope.brands = [];
        $scope.product;
        $scope.model;
        $scope.brand;
        $scope.photo;

        _refreshPhotoData();

        $scope.searchPhoto = function() {
            var method = "POST";
            var url = '/st-line/posts';
            $http({
                method: method,
                url: url,
                data: angular.toJson($scope.photo),
                headers: {
                    'Content-Type': 'application/json'
                }
            }).then(_success, _error);
        };

        function _refreshPhotoData() {
            $http({
                method: 'GET',
                url: '/st-line/photos'
            }).then(
                function(res) {
                    $scope.brands = res.data;
                    $scope.models = res.data;
                    $scope.products = res.data;
                },
                function(res) {
                    console.log("Error: " + res.status + " : " + res.data);
                }
            );
        }

        // $scope.getPhoto = function() {
        //     var photoId = location.search.split('photoId=')[1];
        //     $http({
        //         method: 'GET',
        //         url: '/st-line/posts/'+photoId
        //     }).then(
        //         function(res) {
        //             $scope.photo = res.data;
        //         },
        //         function(res) {
        //             console.log("Error: " + res.status + " : " + res.data);
        //         }
        //     );
        // };

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
            $scope.photo.text = "";
            $scope.photo.description = "";
            $scope.photo.tittle = ""
        };
});