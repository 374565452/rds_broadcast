/**
 * 
 */

app.config(function($stateProvider, $urlRouterProvider){
	$urlRouterProvider.when("","/device/list/menu");
	$stateProvider.state("deviceList",{
		url:"/device/list/:key",
		views:{
			'main':{
				templateUrl:'/rds/device/list/page'
			},
			'page@deviceList':{
				templateUrl:'/rds/page'
			},
			'detail':{
				templateUrl : function($stateParams){
					//alert($stateParams.key);
					return '/rds/device/detail/page/'+$stateParams.key;
				}
			}
		}
	}).state("mediaList",{
		url:"/media/list/:key",
		views:{
			'main':{
				templateUrl:'/rds/media/list/page'
			},
			'page@mediaList':{
				templateUrl:'/rds/page'
			},
			'detail':{
				templateUrl:function($stateParams){
					
					return 'rds/media/detail/page/'+$stateParams.key;
				}
			}
		}
	});
});