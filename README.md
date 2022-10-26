# Spring-Boot
了解Spring-Boot

## Spring+SpringMVC+SpringBoot 注解总结

```html
创建对象的：
@Controller : 放在类的上面，创建控制器对象，注入到spring容器中
@RestController: 放在类上面，创建控制器对象，注入到spring容器中
				作用：复合注解是@Controller,@RestponseBody,使用这个注解类的，里边的控制器方法的返回值都是数据
@Service : 放在业务成的实现类上面，创建service对象，注入到spring容器中
@Repository : 放在dao层的实现类上，创建dao对象，放入到容器。没有使用该注解，是因为使用了Mybatis框架，dao对象是Mynatis通过代理生成的。不需要使用该注解。
@Component ： 放在类上，创建此类对象，放入容器。

赋值的：
@Value ： 简单类型赋值的。
@Autowired : 引用类型赋值自动注入的，支持byName，byType，默认是byType。也可以放在构造方法上面。
@Qualifer ： 给引用类型赋值，使用byName方式
@Resource ： 来自jdk的定义，Javax.annotation。实现引用类型的自动注入，支持byName,byType。
			默认使用不要Name，如果失败在使用不要Type。

其他：
@Configuration : 放在类上面，表示是个配置类，相当于xml文件
@Bean ： 放在方法上，把方法的返回值对象，注入到spring容器中
@ImportResource ： 加载其它的xml配置文件，把文件注入到spring容器中
@PropertySource: 读取其他的properties属性文件
@ComponentScan：扫描器，指定包名，扫描注解

@ResponseBody ：放在方法上，表示方法的返回值是数据，不是视图
@RequestBody ：把请求体中的数据读取出来，转为java对象使用

@Transcational ：处理事务的，放在service实现类的public方法上面，表示此方法有事务

SpringBoot使用的注解：
@SpringBootApplication：放在启动类上，包含@SpringBootConfiguration，@EnableAutoConfiguration，@ComponentScan

MyBatis相关的注解:
@Mapper: 放在类上，让nybatis找到接口，创建代理对象
@MapperScan: 放在主类上（启动类） 指定扫描的包，把包内的所有接口都创建代理对象。注入到spring容器

@Param: 放在dao接口上放的的形参前面，作为命名参数使用

Dubbo注解
@DubboService:在提供者端使用的，暴露服务的，放在接口的实现类 上面
@DubboReference:在消费者端使用的， 引用远程服务， 放在属性 上面使用。
@EnableDubbo :放在主类上面，表示当前引用启 用Dubbo功能。

```



