var app = angular.module("MessageManagement", []);

// Controller Part
app.controller("MessageController", function($scope, $http) {


    $scope.photos = [];
    $scope.photoForm = {
        id: 1,
        model: "",
        brand: "",
        product: ""
    };

    // Now load the data from server
    _refreshPhotoData();

    // HTTP POST/PUT methods for add/edit employee
    // Call: http://localhost:8080/employee
    $scope.submitPhoto = function() {

        var method = "";
        var url = "";

        if ($scope.photoForm.id == -1) {
            method = "POST";
            url = '/st-line/photos';
        } else {
        }

        $http({
            method: method,
            url: url,
            data: angular.toJson($scope.photoForm),
            headers: {
                'Content-Type': 'application/json'
            }
        }).then(_success, _error);
    };

    // In case of edit

    // Private Method
    // HTTP GET- get all employees collection
    // Call: http://localhost:8080/employees
    function _refreshPhotoData() {
        $http({
            method: 'GET',
            url: '/st-line'
        }).then(
            function(res) { // success
                $scope.photos = res.data;
            },
            function(res) { // error
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }

    function _success(res) {
        _refreshPhotoData();
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
        $scope.photoForm.id = -1;
        $scope.photoForm.empNo = "";
        $scope.photoForm.empName = ""
    };
});