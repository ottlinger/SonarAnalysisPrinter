/**
 Copyright 2016, Aiki IT, SonarAnalysisPrinter

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at
 http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package de.aikiit.sonaranalysis;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ApplicationTest {
    @Test
    public void testLaunch() throws Exception {
        Application app = new Application();
        assertNotNull(app);
        app.run();
    }
}