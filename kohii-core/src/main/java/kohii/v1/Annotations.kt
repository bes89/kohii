/*
 * Copyright (c) 2018 Nam Nguyen, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package kohii.v1

import kotlin.annotation.AnnotationRetention.SOURCE

/**
 * @author eneim (2018/07/30).
 */

@Retention(SOURCE)
annotation class Draft(val message: String = "")

@Retention(SOURCE)
annotation class Experiment

@Retention(SOURCE)
annotation class Beta(val message: String = "")

@Retention(SOURCE)
annotation class Stable
