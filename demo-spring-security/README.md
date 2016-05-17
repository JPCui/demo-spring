# demo-spring-security

# web.xml

		<filter>
		<filter-name>springSecurityFilterChain</filter-name>
		<filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
		</filter>
		
		<filter-mapping>
		<filter-name>springSecurityFilterChain</filter-name>
		<url-pattern>/*</url-pattern>
		</filter-mapping>

# spring-security.xml

## A Minimal <http> Configuration

enable web security.

	<http>
	<intercept-url pattern="/**" access="hasRole('USER')" />
	<form-login />
	<logout />
	</http>

> You can also add a method attribute to limit the match to a particular HTTP method (GET, POST, PUT etc.).

To add some users, you can define a set of test data directly in the namespace:

	<authentication-manager>
	<authentication-provider>
		<user-service>
		<user name="jimi" password="jimispassword" authorities="ROLE_USER, ROLE_ADMIN" />
		<user name="bob" password="bobspassword" authorities="ROLE_USER" />
		</user-service>
	</authentication-provider>
	</authentication-manager>

It is also possible to have all requests matching a particular pattern bypass the security filter chain completely, by defining a separate http element for the pattern like this:

(大概意思是通过下面配置，绕过security filter chain)

	<http pattern="/css/**" security="none"/>
	<http pattern="/login.jsp*" security="none"/>


[simple demo getting started](http://docs.spring.io/spring-security/site/docs/4.1.0.RELEASE/reference/htmlsingle/#ns-getting-started)



