## 先进行流程定义和部署

> 参考：com.javasea.workflow.activiti.controller.ProcessDefinitionController
>
> url：localhost:8080/process-definition/deploy

```java
@GetMapping("/deploy")
public void deploy(){
    //1.获取processEngine实例
    ProcessEngine processEngine = standaloneProcessEngineConfiguration.buildProcessEngine();

    //2.获取repositoryService实例
    RepositoryService repositoryService = processEngine.getRepositoryService();

    //3.进行部署
    Deployment deploy = repositoryService.createDeployment()
            .addClasspathResource("diagram/holiday4.bpmn")//添加bpmn资源
            .addClasspathResource("diagram/holiday4.png") //添加png资源
            .name("请假流程-流程变量")//部署的名字
            .deploy();//执行部署
    System.out.println(deploy.getId());
    System.out.println(deploy.getName());
}
```

执行后查询数据库：

![1568731947865](media/1568731947865.png)

![1568732195525](media/1568732195525.png)

![1568732234509](media/1568732234509.png)

## 启动流程实例

> 参考：com.javasea.workflow.activiti.controller.StartInstanceController
>
> url：<http://localhost:8080/startInstance>
