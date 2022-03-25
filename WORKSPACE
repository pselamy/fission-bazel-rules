workspace(name = "fission_node_java_rules")

load("@bazel_tools//tools/build_defs/repo:git.bzl", "git_repository")

git_repository(
    name = "contrib_rules_jvm",
    remote = "https://github.com/bazel-contrib/rules_jvm",
    commit = "f7c08ec6d73ef691b03f843e0c2c3dbe766df584", 
    shallow_since = "1642674503 +0000",
)

load("@contrib_rules_jvm//:repositories.bzl", "contrib_rules_jvm_deps")

contrib_rules_jvm_deps()

load("@contrib_rules_jvm//:setup.bzl", "contrib_rules_jvm_setup")

contrib_rules_jvm_setup()

git_repository(
    name = "rules_jvm_external",
    remote = "https://github.com/bazelbuild/rules_jvm_external",
    tag = "4.2",
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "com.google.auto.value:auto-value:1.9",
        "com.google.auto.value:auto-value-annotations:1.9",
        "com.google.guava:guava:31.0.1-jre",
        "com.google.inject:guice:5.0.1",
        "org.ta4j:ta4j-core:0.14",
        # Test Only Artifacts
        "com.google.truth:truth:1.1.2",
    ],
    repositories = [
        "https://repo1.maven.org/maven2",
    ],
)

git_repository(
    name = "com_google_protobuf",
    commit = "498de9f761bef56a032815ee44b6e6dbe0892cc4",
    remote = "https://github.com/protocolbuffers/protobuf",
    shallow_since = "1580681072 -0800",
)

load("@com_google_protobuf//:protobuf_deps.bzl", "protobuf_deps")

protobuf_deps()

git_repository(
    name = "rules_proto",
    commit = "244e0b64fdc6a89df8b1750eada7b909b3cbc459",
    remote = "https://github.com/bazelbuild/rules_proto",
    shallow_since = "1580681072 -0800",
)

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")

rules_proto_dependencies()

rules_proto_toolchains()

git_repository(
    name = "build_bazel_rules_nodejs",
    remote = "https://github.com/bazelbuild/rules_nodejs.git",
    commit = "5a1cbfaf5ebedc7b9c94f80d9bdb0509508c6377",
    shallow_since = "1646149708 -0800"
)

load("@build_bazel_rules_nodejs//:repositories.bzl", "build_bazel_rules_nodejs_dependencies")

build_bazel_rules_nodejs_dependencies()

load("@build_bazel_rules_nodejs//:index.bzl", "yarn_install")
# Load the node_repositories function
load("@build_bazel_rules_nodejs//:index.bzl", "node_repositories")

# This rule installs nodejs, npm, and yarn, but does NOT install
# your npm dependencies into your node_modules folder.
# You must still run the package manager to do this.
node_repositories(
    package_json = ["//:package.json"],
    node_version = "16.13.2", # specific Node.js version
)

load("@build_bazel_rules_nodejs//:index.bzl", "npm_install")
npm_install(
    # Name this npm so that Bazel Label references look like @npm//package
    name = "npm",
    # Paths to the package*.json files
    package_json = "//:package.json",
    package_lock_json = "//:package-lock.json",
)
