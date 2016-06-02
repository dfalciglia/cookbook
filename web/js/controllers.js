var cookbookControllers = angular.module('cookbookControllers', []);

cookbookControllers.controller('MainController', [ '$scope',
		'$routeParams', '$http', function($scope, $routeParams, $http) {
			$scope.data = {};
			$scope.data.query = '';
		}

]);

cookbookControllers.controller('CategoriesListCtrl', [
		'$scope',
		'$routeParams',
		'$http',
		function($scope, $routeParams, $http) {

			$http.get('rest/categories/listAll').success(function(data) {
				$scope.categories = data;
			});

			$scope.change = function() {
				$scope.$parent.query = $scope.query;
				$http.get('rest/categories/findByReceiptName/' + $scope.data.query)
						.success(function(data) {
							$scope.categories = data._embedded.categories;
						});
			};

			$scope.orderProp = 'order';
		}

]);

cookbookControllers.controller('ReceiptsListCtrl', [
		'$scope',
		'$routeParams',
		'$http',
		function($scope, $routeParams, $http) {
			$http.get('rest/receipts/listAll/' + $routeParams.categoryId)
					.success(function(data) {
						$scope.receipts = data._embedded.receipts;
					});
			$scope.orderProp = 'name';
		} ]);

cookbookControllers.controller('ReceiptCtrl', [
		'$scope',
		'$routeParams',
		'$http',
		function($scope, $routeParams, $http) {
			$http.get('rest/receipts/' + $routeParams.categoryId).success(
					function(data) {
						$scope.receipt = data._embedded.receipts;
					});
		} ]);