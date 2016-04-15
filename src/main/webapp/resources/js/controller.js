/**
 * Created by Le on 1/11/2016.
 */

var cartApp = angular.module ("cartApp", []);

cartApp.controller("cartCtrl", function ($scope, $http){

    $scope.refreshCart = function () {
        $http.get('/eMusicStore/rest/cart/'+$scope.cartId).success(function (data) {
           $scope.cart=data;
        });
    };

    $scope.clearCart = function () {
        $httpdelete('/eMusicStore/rest/cart/'+$scope.cartId).success($scope.refreshCart());
    };

    $scope.initCartId = function (cartId) {
        $scope.cartId = cartId;
        $scope.refreshCart(cartId);
    };

    $scope.addToCart = function (productId) {
        $http.put('/eMusicStore/rest/cart/add/'+productId).success(function () {
            alert("Product successfully added to the cart!")
        });
    };
    $scope.addComment = function (productId) {
        $http.put('/rest/comment/add/{productId}'+productId).success(function () {
            alert("Comment successfully added!")
        });
    };

    $scope.removeFromCart = function (productId) {
        $http.put('/eMusicStore/rest/cart/remove/'+productId).success(function (data) {
            $scope.refreshCart();
        });
    };

    $scope.calGrandTotal = function () {
        var grandTotal=0;

        for (var i=0; i<$scope.cart.cartItems.length; i++) {
            grandTotal+=$scope.cart.cartItems[i].totalPrice;
        }

        return grandTotal;
    };
    
    $http.get('/api')
    .success(function (result) {

        $scope.rules = result;

    })
    .error(function (data, status) {

        console.log(data);

    });

$scope.newRule = '';
$scope.addRule = function (productId) {
    $http.post('/controller/rest/comment/add/'+productId, { newRule: $scope.newRule })
        .success(function (result) {
            alert("success");
            console.log(result);
            $scope.rules = result;
            $scope.newRule = '';

        })
        .error(function (data, status) {
            alert("error"+status);
            console.log(data);

        });
};
});