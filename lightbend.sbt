resolvers in ThisBuild += "lightbend-commercial-mvn" at
  "https://repo.lightbend.com/pass/ufew-6w02eOIlT5mB_0iW_hzpvHX38hHGJ--anovgLYMBpkm/commercial-releases"
resolvers in ThisBuild += Resolver.url("lightbend-commercial-ivy",
  url("https://repo.lightbend.com/pass/ufew-6w02eOIlT5mB_0iW_hzpvHX38hHGJ--anovgLYMBpkm/commercial-releases"))(Resolver.ivyStylePatterns)