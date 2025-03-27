package com.aallam.openai.api.run

import com.aallam.openai.api.BetaOpenAI
import kotlinx.serialization.Serializable
import kotlin.jvm.JvmInline

/**
 * A run id.
 */
@BetaOpenAI
@Serializable
@JvmInline
public value class RunId(public val id: String)
