

var cartApp = angular.module ("cartApp", []);

cartApp.controller("cartCtrl", function ($scope, $http){
	// $scope.productId='';    
	
	$scope.refreshComment = function () {
	    $http.get('/controller/rest/comment/'+$scope.productId).success(function (data) {
	    	alert("inside refreshing");
	    	$scope.rules=data;
	    }).error(function (data, status) {
	        alert(status);
	        console.log(data);

	    });
	};
    $http.get('/controller/rest/comment/'+$scope.productId)
    .success(function (result) {
       
        $scope.rules = result;
        //alert( $scope.rules);

    })
    .error(function (data, status) {
        alert(status);
        console.log(data);

    });

$scope.newRule = '';
$scope.addRule = function (productId) {
    $http.post('/controller/rest/comment/add/'+productId, { newRule: $scope.newRule })
        .success(function (result) {
           // alert("data inserted");
        	
            console.log(result);
            $scope.rules = result;
            $scope.newRule = '';
            //$scope.refreshComment();

        })
        .error(function (data, status) {
            alert("error"+status);
            console.log(data);

        });
};


});