dataSource {
	pooled = true
	driverClassName = "org.hsqldb.jdbcDriver"
	username = "sa"
	password = ""
}
hibernate {
    cache.use_second_level_cache=true
    cache.use_query_cache=true
    cache.provider_class='com.opensymphony.oscache.hibernate.OSCacheProvider'
}
// environment specific settings
environments {
	development {
		dataSource {
			//dbCreate = "create-drop" // one of 'create', 'create-drop','update'
			//url = "jdbc:hsqldb:mem:devDB"
            dbCreate = "validate"
            url = "jdbc:hsqldb:file:target/db/hsqldb/legacy/legacy;shutdown=true"
        }
	}
	test {
		dataSource {
			dbCreate = "validate"
			url = "jdbc:hsqldb:file:target/db/hsqldb/legacy/legacy;shutdown=true"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "jdbc:hsqldb:file:prodDb;shutdown=true"
		}
	}
}