# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.12

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = "D:\WorkSoftware\CLion 2018.2.4\bin\cmake\win\bin\cmake.exe"

# The command to remove a file.
RM = "D:\WorkSoftware\CLion 2018.2.4\bin\cmake\win\bin\cmake.exe" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/ProgrammingCpp.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/ProgrammingCpp.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/ProgrammingCpp.dir/flags.make

CMakeFiles/ProgrammingCpp.dir/main.cpp.obj: CMakeFiles/ProgrammingCpp.dir/flags.make
CMakeFiles/ProgrammingCpp.dir/main.cpp.obj: ../main.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/ProgrammingCpp.dir/main.cpp.obj"
	D:\WorkSoftware\MinGW\bin\g++.exe  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles\ProgrammingCpp.dir\main.cpp.obj -c D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\main.cpp

CMakeFiles/ProgrammingCpp.dir/main.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/ProgrammingCpp.dir/main.cpp.i"
	D:\WorkSoftware\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\main.cpp > CMakeFiles\ProgrammingCpp.dir\main.cpp.i

CMakeFiles/ProgrammingCpp.dir/main.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/ProgrammingCpp.dir/main.cpp.s"
	D:\WorkSoftware\MinGW\bin\g++.exe $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\main.cpp -o CMakeFiles\ProgrammingCpp.dir\main.cpp.s

# Object files for target ProgrammingCpp
ProgrammingCpp_OBJECTS = \
"CMakeFiles/ProgrammingCpp.dir/main.cpp.obj"

# External object files for target ProgrammingCpp
ProgrammingCpp_EXTERNAL_OBJECTS =

ProgrammingCpp.exe: CMakeFiles/ProgrammingCpp.dir/main.cpp.obj
ProgrammingCpp.exe: CMakeFiles/ProgrammingCpp.dir/build.make
ProgrammingCpp.exe: CMakeFiles/ProgrammingCpp.dir/linklibs.rsp
ProgrammingCpp.exe: CMakeFiles/ProgrammingCpp.dir/objects1.rsp
ProgrammingCpp.exe: CMakeFiles/ProgrammingCpp.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\cmake-build-debug\CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Linking CXX executable ProgrammingCpp.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\ProgrammingCpp.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/ProgrammingCpp.dir/build: ProgrammingCpp.exe

.PHONY : CMakeFiles/ProgrammingCpp.dir/build

CMakeFiles/ProgrammingCpp.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\ProgrammingCpp.dir\cmake_clean.cmake
.PHONY : CMakeFiles/ProgrammingCpp.dir/clean

CMakeFiles/ProgrammingCpp.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\cmake-build-debug D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\cmake-build-debug D:\WorkSpace\GitHub\ProgrammingTraining\ProgrammingCpp\cmake-build-debug\CMakeFiles\ProgrammingCpp.dir\DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/ProgrammingCpp.dir/depend

