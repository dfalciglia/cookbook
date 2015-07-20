var cookbookApp = angular.module('cookbookApp', [
  'ngRoute',
  'cookbookControllers'
]);

cookbookApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/categories', {
        templateUrl: 'partials/categories-list.html',
        controller: 'CategoriesListCtrl'
      }).
      when('/receipts/:categoryId', {
        templateUrl: 'partials/receipts-list.html',
        controller: 'ReceiptsListCtrl'
      }).
      when('/receipt/:categoryId', {
          templateUrl: 'partials/receipt.html',
          controller: 'ReceiptCtrl'
        }).
      otherwise({
        redirectTo: '/'
      });
  }]);