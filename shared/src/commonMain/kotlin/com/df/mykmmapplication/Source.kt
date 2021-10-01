package com.df.mykmmapplication

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class Source {
    @SerialName("Subject")
    val subject: String = ""

    @SerialName("Confidence")
    val confidence: String = ""

    @SerialName("PropertyHits")
    val propertyHits: List<String> = listOf()

    @Serializable
    @SerialName("People")
    data class PeopleSource(
        @SerialName("DisplayName")
        val displayName: String?,

        @SerialName("GivenName")
        val givenName: String?,

        @SerialName("Surname")
        val surname: String?,

        @SerialName("EmailAddresses")
        val emailAddresses: List<String>?,

        @SerialName("CompanyName")
        val companyName: String?,

        @SerialName("Department")
        val department: String?,

        @SerialName("OfficeLocation")
        val officeLocation: String?,

        @SerialName("Phones")
        val phones: List<Phone>?,

        @SerialName("JobTitle")
        val jobTitle: String?,

        @SerialName("ImAddress")
        val imAddress: String?,

        @SerialName("PeopleType")
        val peopleType: String?,

        @SerialName("PeopleSubtype")
        val peopleSubtype: String?,

        @SerialName("UserPrincipalName")
        val userPrincipalName: String?,

        @SerialName("Inferences")
        val inferences: Inferences?,
    ) : Source()

    @Serializable
    @SerialName("Acronym")
    data class AcronymSource(
        @SerialName("Id")
        val id: String?,

        @SerialName("Name")
        val name: String?,

        @SerialName("SourceAdminAcronym")
        val adminSource: AdminSource?,

        @SerialName("SourceEmail")
        val emailSource: EmailSource?,

        @SerialName("SourceFile")
        val fileSource: FileSource?,
    ) : Source() {
        @Serializable
        data class AdminSource(
            @SerialName("Snippet")
            val snippet: String?,
        )

        @Serializable
        data class FileSource(
            @SerialName("Subject")
            val subject: String?,

            @SerialName("Uri")
            val uri: String?,
        )

        @Serializable
        data class EmailSource(
            @SerialName("Subject")
            val subject: String?,

            @SerialName("Id")
            val id: String?,
        )
    }

    @Serializable
    @SerialName("Bookmark")
    data class BookmarkSource(
        @SerialName("displayTitle")
        val displayTitle: String?,

        @SerialName("snippet")
        val snippet: Snippet?,

        @SerialName("url")
        val url: String?,

        @SerialName("domain")
        val domain: String?
    ) : Source()

    @Serializable
    @SerialName("MeetingProposal")
    data class MeetingProposalSource(
        @SerialName("OrganizerAvailability")
        val organizerAvailability: String?,

        @SerialName("MeetingTimeSlot")
        val meetingTimeSlot: MeetingTimeSlot?,

        @SerialName("Order")
        val order: Int?,

        @SerialName("AttendeeAvailability")
        val attendeeAvailabilities: List<AttendeeAvailability>?
    ) : Source()

    @Serializable
    data class FileSource(
        @SerialName("AttachmentId")
        val attachmentId: Id?,

        @SerialName("ConversationId")
        val conversationId: Id?,

        @SerialName("ItemId")
        val itemId: Id?,

        @SerialName("From")
        val from: From?,

        @SerialName("FileName")
        val fileName: String?,

        @SerialName("FileSize")
        val fileSize: Long?,

        @SerialName("DateCreated")
        val dateCreated: String?,

        @SerialName("DateModified")
        val dateModified: String?,

        @SerialName("DateAccessed")
        val dateAccessed: String?,

        @SerialName("FileExtension")
        val fileExtension: String?,

        @SerialName("FileType")
        val fileType: String?,

        @SerialName("FileSourceType")
        val fileSourceType: String?,

        @SerialName("AccessUrl")
        val accessUrl: String?,

        @SerialName("Title")
        val title: String?,

        @SerialName("Author")
        val author: String?,

        @SerialName("AuthorEmail")
        val authorEmail: String?,

        @SerialName("ModifiedBy")
        val modifiedBy: String?,

        @SerialName("ModifiedByDisplayName")
        val modifiedByDisplayName: String?,

        @SerialName("UserRelationshipType")
        val userRelationshipType: String?
    ) : Source()

    @Serializable
    @SerialName("Event")
    data class CalendarSource(
        @SerialName("OrganizerName")
        val organizerName: String?,

        @SerialName("OrganizerAddress")
        val organizerAddress: String?,

        @SerialName("Attendees")
        val attendees: List<Attendee>?,

        @SerialName("Start")
        val eventStartTime: String?,

        @SerialName("End")
        val eventEndTime: String?,

        @SerialName("Location")
        val eventLocation: String?,

        @SerialName("EventId")
        val eventId: Id?,

        @SerialName("ImmutableId")
        val immutableId: String?,

        @SerialName("Uid")
        val uid: String?,

        @SerialName("Importance")
        val importance: String?,

        @SerialName("SkypeTeamsMeetingUrl")
        val meetingUrl: String?,

        @SerialName("WebLink")
        val webLink: String?,

        @SerialName("ResponseStatus")
        val responseStatus: Status?,

        @SerialName("IsAllDay")
        val isAllDay: Boolean?,

        @SerialName("IsOrganizer")
        val isOrganizer: Boolean?,

        @SerialName("ShowAs")
        val showAs: String?,

        @SerialName("HasAttachments")
        val hasAttachments: Boolean?
    ) : Source()

    @Serializable
    @SerialName("Link")
    data class LinkSource(
        @SerialName("Description")
        val description: String?,

        @SerialName("ImmutableMessageId")
        val immutableMessageId: String?,

        @SerialName("LinksInsights")
        val linksInsights: LinksInsights?,

        @SerialName("LastSharedTimeUtc")
        val lastSharedTimeUtc: String?,

        @SerialName("LinkedText")
        val linkedText: String?,

        @SerialName("MessageThreadId")
        val messageThreadId: String?,

        @SerialName("SafeUrl")
        val safeUrl: String?,

        @SerialName("SenderAddress")
        val senderAddress: String?,

        @SerialName("SenderName")
        val senderName: String?,

        @SerialName("SharingReferenceType")
        val sharingReferenceType: String?,

        @SerialName("TeamsLinkMessageId")
        val teamsLinkMessageId: String?,

        @SerialName("Title")
        val title: String?,

        @SerialName("Url")
        val url: String?,
    ) : Source()

    @Serializable
    class UnknownSource : Source()
}