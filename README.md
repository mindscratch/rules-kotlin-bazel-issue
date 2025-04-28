This repository demonstrates using rules_kotlin to create a test which is unable to access `data` provided by a library on which the test depends.

If the `kt_jvm_test` is configured to depend on `":footest-deps"` the test fill fail because the test can't access runfiles, when configured to depend on `":foolib"` it will pass. The `:footest-deps` is a library that simply exports dependencies, this mimics the behavior found in `rules_jvm` and seems to be the reason why the test is failing.

In `rules_jvm/java/private/create_jvm_test_suite.bzl` the `create_jvm_test_suite` rule has this to create the deps library which exports dependencies:

```
# Optimization for classpath, reduces the duplicate dependencies for each test to instead rely on one target
deps_lib_name = "%s-test-deps-lib" % name
define_library(
    name = deps_lib_name,
    exports = deps,
    visibility = ["//visibility:private"],
    tags = tags,
    testonly = True,
    **library_attrs
)
```