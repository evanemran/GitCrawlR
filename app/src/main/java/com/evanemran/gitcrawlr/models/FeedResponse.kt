package com.evanemran.gitcrawlr.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class FeedResponse : Serializable {
    @SerializedName("total_count")
    val totalCount: Long = 0

    @SerializedName("incomplete_results")
    val incompleteResults: Boolean = false
    val items: List<FeedItem> = listOf()
}

class FeedItem : Serializable {
    val id: Long = 0

    @SerializedName("node_id")
    val nodeId: String = ""
    val name: String = ""

    @SerializedName("full_name")
    val fullName: String = ""
    val private: Boolean = false
    val owner: Owner? = null

    @SerializedName("html_url")
    val htmlUrl: String = ""
    val description: String = ""
    val fork: Boolean = false
    val url: String = ""

    @SerializedName("forks_url")
    val forksUrl: String = ""

    @SerializedName("keys_url")
    val keysUrl: String = ""

    @SerializedName("collaborators_url")
    val collaboratorsUrl: String = ""

    @SerializedName("teams_url")
    val teamsUrl: String = ""

    @SerializedName("hooks_url")
    val hooksUrl: String = ""

    @SerializedName("issue_events_url")
    val issueEventsUrl: String = ""

    @SerializedName("events_url")
    val eventsUrl: String = ""

    @SerializedName("assignees_url")
    val assigneesUrl: String = ""

    @SerializedName("branches_url")
    val branchesUrl: String = ""

    @SerializedName("tags_url")
    val tagsUrl: String = ""

    @SerializedName("blobs_url")
    val blobsUrl: String = ""

    @SerializedName("git_tags_url")
    val gitTagsUrl: String = ""

    @SerializedName("git_refs_url")
    val gitRefsUrl: String = ""

    @SerializedName("trees_url")
    val treesUrl: String = ""

    @SerializedName("statuses_url")
    val statusesUrl: String = ""

    @SerializedName("languages_url")
    val languagesUrl: String = ""

    @SerializedName("stargazers_url")
    val stargazersUrl: String = ""

    @SerializedName("contributors_url")
    val contributorsUrl: String = ""

    @SerializedName("subscribers_url")
    val subscribersUrl: String = ""

    @SerializedName("subscription_url")
    val subscriptionUrl: String = ""

    @SerializedName("commits_url")
    val commitsUrl: String = ""

    @SerializedName("git_commits_url")
    val gitCommitsUrl: String = ""

    @SerializedName("comments_url")
    val commentsUrl: String = ""

    @SerializedName("issue_comment_url")
    val issueCommentUrl: String = ""

    @SerializedName("contents_url")
    val contentsUrl: String = ""

    @SerializedName("compare_url")
    val compareUrl: String = ""

    @SerializedName("merges_url")
    val mergesUrl: String = ""

    @SerializedName("archive_url")
    val archiveUrl: String = ""

    @SerializedName("downloads_url")
    val downloadsUrl: String = ""

    @SerializedName("issues_url")
    val issuesUrl: String = ""

    @SerializedName("pulls_url")
    val pullsUrl: String = ""

    @SerializedName("milestones_url")
    val milestonesUrl: String = ""

    @SerializedName("notifications_url")
    val notificationsUrl: String = ""

    @SerializedName("labels_url")
    val labelsUrl: String = ""

    @SerializedName("releases_url")
    val releasesUrl: String = ""

    @SerializedName("deployments_url")
    val deploymentsUrl: String = ""

    @SerializedName("created_at")
    val createdAt: String = ""

    @SerializedName("updated_at")
    val updatedAt: String = ""

    @SerializedName("pushed_at")
    val pushedAt: String = ""

    @SerializedName("git_url")
    val gitUrl: String = ""

    @SerializedName("ssh_url")
    val sshUrl: String = ""

    @SerializedName("clone_url")
    val cloneUrl: String = ""

    @SerializedName("svn_url")
    val svnUrl: String = ""
    val homepage: String? = null
    val size: Long = 0

    @SerializedName("stargazers_count")
    val stargazersCount: Long = 0

    @SerializedName("watchers_count")
    val watchersCount: Long = 0
    val language: String? = null

    @SerializedName("has_issues")
    val hasIssues: Boolean = false

    @SerializedName("has_projects")
    val hasProjects: Boolean = false

    @SerializedName("has_downloads")
    val hasDownloads: Boolean = false

    @SerializedName("has_wiki")
    val hasWiki: Boolean = false

    @SerializedName("has_pages")
    val hasPages: Boolean = false

    @SerializedName("has_discussions")
    val hasDiscussions: Boolean = false

    @SerializedName("forks_count")
    val forksCount: Long = 0

    @SerializedName("mirror_url")
    val mirrorUrl: Any? = null
    val archived: Boolean = false
    val disabled: Boolean = false

    @SerializedName("open_issues_count")
    val openIssuesCount: Long = 0
    val license: License? = null

    @SerializedName("allow_forking")
    val allowForking: Boolean = false

    @SerializedName("is_template")
    val isTemplate: Boolean = false

    @SerializedName("web_commit_signoff_required")
    val webCommitSignoffRequired: Boolean = false
    val topics: List<String> = listOf()
    val visibility: String = ""
    val forks: Long = 0

    @SerializedName("open_issues")
    val openIssues: Long = 0
    val watchers: Long = 0

    @SerializedName("default_branch")
    val defaultBranch: String = ""
    val score: Double = 0.0
}

class Owner : Serializable {
    val login: String = ""
    val id: Long = 0

    @SerializedName("node_id")
    val nodeId: String = ""

    @SerializedName("avatar_url")
    val avatarUrl: String = ""

    @SerializedName("gravatar_id")
    val gravatarId: String = ""
    val url: String = ""

    @SerializedName("html_url")
    val htmlUrl: String = ""

    @SerializedName("followers_url")
    val followersUrl: String = ""

    @SerializedName("following_url")
    val followingUrl: String = ""

    @SerializedName("gists_url")
    val gistsUrl: String = ""

    @SerializedName("starred_url")
    val starredUrl: String = ""

    @SerializedName("subscriptions_url")
    val subscriptionsUrl: String = ""

    @SerializedName("organizations_url")
    val organizationsUrl: String = ""

    @SerializedName("repos_url")
    val reposUrl: String = ""

    @SerializedName("events_url")
    val eventsUrl: String = ""

    @SerializedName("received_events_url")
    val receivedEventsUrl: String = ""
    val type: String = ""

    @SerializedName("site_admin")
    val siteAdmin: Boolean = false
}

class License : Serializable {
    val key: String = ""
    val name: String = ""

    @SerializedName("spdx_id")
    val spdxId: String = ""
    val url: String = ""

    @SerializedName("node_id")
    val nodeId: String = ""
}
