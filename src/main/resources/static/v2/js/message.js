var app = angular.module("MessageManagement", []);

// Controller Part
app.controller("MessageController", function($scope, $http) {


    $scope.messages = [];
    $scope.messageForm = {
        id: 1,
        name: "",
        phone: "",
        message: ""
    };

    // Now load the data from server
    _refreshMessageData();

    // HTTP POST/PUT methods for add/edit employee
    // Call: http://localhost:8080/employee
    $scope.submitMessage = function() {

        var method = "";
        var url = "";

        if ($scope.messageForm.empId == -1) {
            method = "POST";
            url = '/st-line';
        } else {
        }

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

    // HTTP DELETE- delete employee by Id
    // Call: http://localhost:8080/employee/{empId}
    $scope.deleteMessage = function(message) {
        $http({
            method: 'DELETE',
            url: '/st-line/' + message.id
        }).then(_success, _error);
    };

    // In case of edit
    $scope.editEmployee = function(message) {
        $scope.messageForm.id = message.id;
        $scope.messageForm.name = message.name;
        $scope.messageForm.phone = message.phone;
        $scope.messageForm.message = message.message;
    };

    // Private Method
    // HTTP GET- get all employees collection
    // Call: http://localhost:8080/employees
    function _refreshMessageData() {
        $http({
            method: 'GET',
            url: '/st-line'
        }).then(
            function(res) { // success
                $scope.messages = res.data;
            },
            function(res) { // error
                console.log("Error: " + res.status + " : " + res.data);
            }
        );
    }

    function _success(res) {
        _refreshMessageData();
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
        $scope.messageForm.empId = -1;
        $scope.messageForm.empNo = "";
        $scope.messageForm.empName = ""
    };
});