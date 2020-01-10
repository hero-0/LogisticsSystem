/*var a=[[@{/login/logins}]];
element.on('nav(test)', function(data){
            console.log(data);
            var exist=$(".layui-tab-title li[lay-id='"+data[0].id+"']").length //判断是否存在tab
            if($(this).attr("lay-herf") && exist==0){
                element.tabAdd('demo', {
                    title: data[0].text
                    ,content: '<iframe class="layadmin-iframe" src="views/'+$(this).attr("lay-herf")+'"></iframe>' //支持传入html
                    ,id: data[0].id
                });
            }
            element.tabChange('demo', data[0].id);
        });
*/